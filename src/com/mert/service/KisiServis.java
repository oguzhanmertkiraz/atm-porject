package com.mert.service;

import com.mert.model.Kisi;

import java.util.List;

public interface KisiServis {
    public Kisi getKisi(Long id);

    List<Kisi> kisiList();
}
