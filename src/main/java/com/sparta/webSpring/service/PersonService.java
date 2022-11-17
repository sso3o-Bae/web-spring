package com.sparta.webSpring.service;

import com.sparta.webSpring.domain.Person;
import com.sparta.webSpring.domain.PersonRepository;
import com.sparta.webSpring.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto personRequestDto) {
        Person person1 = personRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person1.update(personRequestDto);
        return person1.getId();
    }
}
