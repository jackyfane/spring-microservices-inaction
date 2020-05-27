package com.yaomalang.eagleeye.licenses.dao;

import com.yaomalang.eagleeye.licenses.models.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicensingRepository extends JpaRepository<License, String>, JpaSpecificationExecutor<License> {
}
