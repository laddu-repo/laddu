package p0;

import android.os.LocaleList;
import h.v;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f10187a;

    public j(Object obj) {
        this.f10187a = v.g(obj);
    }

    @Override // p0.i
    public final String a() {
        return this.f10187a.toLanguageTags();
    }

    @Override // p0.i
    public final Object b() {
        return this.f10187a;
    }

    public final boolean equals(Object obj) {
        return this.f10187a.equals(((i) obj).b());
    }

    @Override // p0.i
    public final Locale get(int i) {
        return this.f10187a.get(i);
    }

    public final int hashCode() {
        return this.f10187a.hashCode();
    }

    @Override // p0.i
    public final boolean isEmpty() {
        return this.f10187a.isEmpty();
    }

    @Override // p0.i
    public final int size() {
        return this.f10187a.size();
    }

    public final String toString() {
        return this.f10187a.toString();
    }
}
