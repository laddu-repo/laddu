package com.unity3d.services.core.request.metrics;

import ie.s;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            str = metric.name;
        }
        if ((i6 & 2) != 0) {
            obj = metric.value;
        }
        if ((i6 & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> tags) {
        k.e(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        if (k.a(this.name, metric.name) && k.a(this.value, metric.value) && k.a(this.tags, metric.tags)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj = this.value;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return this.tags.hashCode() + ((i10 + i6) * 31);
    }

    public final Map<String, Object> toMap() {
        je.f fVar = new je.f();
        String str = this.name;
        if (str != null) {
            fVar.put(METRIC_NAME, str);
        }
        Object obj = this.value;
        if (obj != null) {
            fVar.put(METRIC_VALUE, obj);
        }
        if (!this.tags.isEmpty()) {
            fVar.put(METRIC_TAGS, this.tags);
        }
        return fVar.b();
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(String str, Object obj, Map<String, String> tags) {
        k.e(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i6, f fVar) {
        this(str, (i6 & 2) != 0 ? null : obj, (i6 & 4) != 0 ? s.f6847x : map);
    }
}
