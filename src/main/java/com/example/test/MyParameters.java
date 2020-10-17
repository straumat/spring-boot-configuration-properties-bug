package com.example.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@ConfigurationProperties(prefix = "parameters")
public class MyParameters {

    /** Parameter 1. */
    private String parameter1;

    /** Parameter 2. */
    @NotNull(message = "Parameter 2 not set")
    private String parameter2;

    /** Inner parameters. */
    @Valid
    private InnerParameters innerParameters = new InnerParameters();

    /**
     * Inner parameters.
     */
    @Validated
    @ConfigurationProperties(prefix = "parameters.inner")
    public class InnerParameters {

        /** Parameter 2. */
        @NotNull(message = "Inner parameter 1 not set")
        private String innerParameter1;

        /**
         * Getter innerParameter1.
         *
         * @return innerParameter1
         */
        public String getInnerParameter1() {
            return innerParameter1;
        }

        /**
         * Setter innerParameter1.
         *
         * @param newInnerParameter1 the innerParameter1 to set
         */
        public void setInnerParameter1(final String newInnerParameter1) {
            innerParameter1 = newInnerParameter1;
        }

    }

    /**
     * Getter parameter1.
     *
     * @return parameter1
     */
    public final String getParameter1() {
        return parameter1;
    }

    /**
     * Setter parameter1.
     *
     * @param newParameter1 the parameter1 to set
     */
    public final void setParameter1(String newParameter1) {
        parameter1 = newParameter1;
    }

    /**
     * Getter parameter2.
     *
     * @return parameter2
     */
    public final String getParameter2() {
        return parameter2;
    }

    /**
     * Setter parameter2.
     *
     * @param newParameter2 the parameter2 to set
     */
    public final void setParameter2(String newParameter2) {
        parameter2 = newParameter2;
    }

    /**
     * Getter innerParameters.
     *
     * @return innerParameters
     */
    public InnerParameters getInnerParameters() {
        return innerParameters;
    }

    /**
     * Setter innerParameters.
     *
     * @param newInnerParameters the innerParameters to set
     */
    public void setInnerParameters(final InnerParameters newInnerParameters) {
        innerParameters = newInnerParameters;
    }

}
