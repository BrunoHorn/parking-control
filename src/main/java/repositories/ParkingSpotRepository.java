package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
