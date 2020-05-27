package com.yaomalang.eagleeye.licenses.services.impl;

import com.yaomalang.eagleeye.licenses.dao.LicensingRepository;
import com.yaomalang.eagleeye.licenses.models.License;
import com.yaomalang.eagleeye.licenses.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LicensingService implements BaseService<License> {

    @Autowired
    private LicensingRepository repository;

    @Override
    public void save(License entity) {
        repository.save(entity);
    }

    @Override
    public License findOneById(String id) {
        Optional<License> optional = repository.findById(id);
        if (optional.get() != null) return optional.get();
        return null;
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public void update(License entity) {
        repository.save(entity);
    }
}
