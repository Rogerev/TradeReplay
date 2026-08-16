package com.tradereplay.backend.service;

import com.tradereplay.backend.model.Instrument;
import com.tradereplay.backend.repository.InstrumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentService {

    private final InstrumentRepository instrumentRepository;

    public InstrumentService(InstrumentRepository instrumentRepository) {
        this.instrumentRepository = instrumentRepository;
    }

    public List<Instrument> getAllInstruments() {
        return instrumentRepository.findAll();
    }

    public Instrument createInstrument(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }
}