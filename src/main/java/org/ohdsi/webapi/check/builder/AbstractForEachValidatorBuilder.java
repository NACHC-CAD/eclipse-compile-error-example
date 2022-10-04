package org.ohdsi.webapi.check.builder;

import java.util.ArrayList;
import java.util.List;

import org.ohdsi.webapi.check.validator.ValidatorGroup;

public abstract class AbstractForEachValidatorBuilder<T, V, X> extends ValidatorBuilder<V> {

    private List<ValidatorGroupBuilder<T, X>> validatorGroupBuilders = new ArrayList<ValidatorGroupBuilder<T, X>>();

    protected List<ValidatorGroup<T,X>> initGroups() {
        return initAndBuildList(this.validatorGroupBuilders);
    }

    private <U> List<U> initAndBuildList(List<? extends ValidatorBaseBuilder<T, U, ?>> builders) {
    	return null;
    }

}

