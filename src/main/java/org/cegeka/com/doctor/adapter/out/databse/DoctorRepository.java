package org.cegeka.com.doctor.adapter.out.databse;

import org.cegeka.com.doctor.adapter.out.databse.model.DoctorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorData, Integer> {
    Collection<DoctorData> findByEmail(String email);
}
