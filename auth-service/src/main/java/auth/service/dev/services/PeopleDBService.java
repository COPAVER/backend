package auth.service.dev.services;


import auth.service.dev.repositories.PeopleRepository;
import auth.service.dev.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PeopleDBService {

    private final PeopleRepository peopleRepository;

    public Optional<Person> getByUsername(String username){
        return peopleRepository.findPersonByUsername(username);
    }

    public Optional<Person> getByEmail(String email){
        return peopleRepository.findPersonByEmail(email);
    }

    @Transactional(readOnly = false)
    public void save(Person person){
        peopleRepository.save(person);
    }
}
