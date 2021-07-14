/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Red Hat, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.redhat.jenkins.plugins.ci.messaging.checks;

import org.kohsuke.stapler.DataBoundConstructor;

import java.util.Objects;

public class MsgCheck {
    private final String field;
    private final String expectedValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MsgCheck msgCheck = (MsgCheck) o;

        if (!Objects.equals(field, msgCheck.field)) return false;
        return Objects.equals(expectedValue, msgCheck.expectedValue);
    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode(): 0;
        result = 31 * result + (expectedValue != null ? expectedValue.hashCode(): 0);
        return result;
    }

    @DataBoundConstructor
    public MsgCheck(String field, String expectedValue) {
        super();
        this.field = field;
        this.expectedValue = expectedValue;
    }

    public String getField() {
        return field;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    @Override
    public String toString() {
        return "MsgCheck{" +
                "field='" + field + '\'' +
                ", expectedValue='" + expectedValue + '\'' +
                '}';
    }
}
