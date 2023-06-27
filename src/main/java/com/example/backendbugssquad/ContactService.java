package com.example.backendbugssquad;

import org.springframework.stereotype.Service;
@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact enregistrerContact(Contact contact) {
        return contactRepository.save(contact);
    }
}