package com.qualco.nationassignment.repository;

import com.qualco.nationassignment.domain.RegionArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionAreaRepository  extends JpaRepository<RegionArea, String> {
}
