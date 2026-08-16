

package com.tradereplay.backend.repository;

import com.tradereplay.backend.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
}