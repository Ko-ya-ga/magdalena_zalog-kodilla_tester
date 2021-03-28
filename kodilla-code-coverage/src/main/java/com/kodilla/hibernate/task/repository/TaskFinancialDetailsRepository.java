package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
