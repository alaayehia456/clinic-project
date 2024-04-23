package com.clinic.dao.Specification;

import com.clinic.Model.Clinic;
import com.clinic.Model.Dto.search.form.ClinicSearch;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClinicSpecification {

    public static Specification<Clinic> search(ClinicSearch searchForm) {
        return (Root<Clinic> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();


            if (Objects.nonNull(searchForm.getAddress()))
                predicates.add(cb.like(root.get("address"), "%" + searchForm.getAddress() + "%"));


            if (Objects.nonNull(searchForm.getPhoneNumber()))
                predicates.add(cb.equal(root.get("phoneNumber"), "%" +searchForm.getPhoneNumber() + "%"));

            query.distinct(true);
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
