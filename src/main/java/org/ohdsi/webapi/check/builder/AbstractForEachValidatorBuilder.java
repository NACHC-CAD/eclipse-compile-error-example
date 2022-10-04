package org.ohdsi.webapi.check.builder;

import java.util.ArrayList;
import java.util.List;

import org.ohdsi.webapi.check.validator.ValidatorGroup;

public abstract class AbstractForEachValidatorBuilder<T, V> extends ValidatorBuilder<V> {

    private List<ValidatorGroupBuilder<T, V>> validatorGroupBuilders = new ArrayList<ValidatorGroupBuilder<T, V>>();

    protected List<ValidatorGroup<T, V>> initGroups() {
        return initAndBuildList(this.validatorGroupBuilders);
    }

    private <U> List<U> initAndBuildList(List<? extends ValidatorBaseBuilder<T, U, ?>> builders) {
    	return null;
    }

}

