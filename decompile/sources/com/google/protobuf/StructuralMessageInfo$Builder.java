package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<f1> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public c4 build() {
        if (!this.wasBuilt) {
            if (this.syntax != null) {
                this.wasBuilt = true;
                Collections.sort(this.fields);
                return new c4(this.syntax, this.messageSetWireFormat, this.checkInitialized, (f1[]) this.fields.toArray(new f1[0]), this.defaultInstance);
            }
            throw new IllegalStateException("Must specify a proto syntax");
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(f1 f1Var) {
        if (!this.wasBuilt) {
            this.fields.add(f1Var);
            return;
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withMessageSetWireFormat(boolean z10) {
        this.messageSetWireFormat = z10;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i6) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i6);
    }
}
