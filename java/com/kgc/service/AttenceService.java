package com.kgc.service;

import com.kgc.pojo.Attence;

import java.util.List;

public interface AttenceService {
    List<Attence> getlist();
    int add(Attence attence);
}
