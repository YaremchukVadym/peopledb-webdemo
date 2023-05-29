package com.neutrinosys.peopledbweb.biz.service;

import com.neutrinosys.peopledbweb.biz.model.Person;
import com.neutrinosys.peopledbweb.date.FileStorageRepository;
import com.neutrinosys.peopledbweb.date.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.io.InputStream;
import java.util.Optional;
import java.util.Set;


@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final FileStorageRepository storageRepository;


    public PersonService(PersonRepository personRepository, FileStorageRepository fileStorageRepository) {
        this.personRepository = personRepository;
        this.storageRepository = fileStorageRepository;
    }

    @Transactional
    public Person save(Person person, InputStream photoStream) {
        Person savedPerson = personRepository.save(person);
        storageRepository.save(person.getPhotoFilename(), photoStream);
        return savedPerson;
    }

    public Optional<Person> findById(Long aLong) {
        return personRepository.findById(aLong);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }


    public void deleteAllById(Iterable<Long> ids) {
        Set<String> filenames = personRepository.findFilenameByIds(ids);
        personRepository.deleteAllById(ids);
        storageRepository.deleteAllByName(filenames);
    }

}
