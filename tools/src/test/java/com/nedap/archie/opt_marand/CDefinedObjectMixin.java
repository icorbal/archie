package com.nedap.archie.opt_marand;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.nedap.archie.aom.CDefinedObject;
import com.nedap.archie.base.OpenEHRBase;

public abstract class CDefinedObjectMixin extends CDefinedObject<Object> {

    @Override
    @JsonDeserialize(using=DefaultValueDeserializer.class)
    public abstract void setDefaultValue(Object something);

}