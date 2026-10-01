package com.unity3d.ads.core.data.model;

import h8.c;
import java.util.List;
import kotlin.jvm.internal.k;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i6, String entryPoint, List<String> additionalFiles, String type) {
        k.e(entryPoint, "entryPoint");
        k.e(additionalFiles, "additionalFiles");
        k.e(type, "type");
        this.version = i6;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i6, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = webViewConfiguration.version;
        }
        if ((i10 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i10 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i10 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i6, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i6, String entryPoint, List<String> additionalFiles, String type) {
        k.e(entryPoint, "entryPoint");
        k.e(additionalFiles, "additionalFiles");
        k.e(type, "type");
        return new WebViewConfiguration(i6, entryPoint, additionalFiles, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        if (this.version == webViewConfiguration.version && k.a(this.entryPoint, webViewConfiguration.entryPoint) && k.a(this.additionalFiles, webViewConfiguration.additionalFiles) && k.a(this.type, webViewConfiguration.type)) {
            return true;
        }
        return false;
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.additionalFiles.hashCode() + c.g(this.entryPoint, this.version * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewConfiguration(version=");
        sb2.append(this.version);
        sb2.append(", entryPoint=");
        sb2.append(this.entryPoint);
        sb2.append(", additionalFiles=");
        sb2.append(this.additionalFiles);
        sb2.append(", type=");
        return a.n(sb2, this.type, ')');
    }
}
