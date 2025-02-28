package com.example;

public class part2 {
	private final part1 repository;

    public JUnit_Task10_Component2(part1 repository) {
        this.repository = repository;
    }

    public String processAndSave(int id, String value) {
        String processedValue = value.toUpperCase();
        repository.save(id, processedValue);
        return processedValue;
    }

    public String getProcessedValue(int id) {
        return repository.findById(id);
    }

}
