package c6;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Appendable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Appendable f2243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2244w = true;

    public v(Appendable appendable) {
        this.f2243v = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        boolean z2 = this.f2244w;
        Appendable appendable = this.f2243v;
        if (z2) {
            this.f2244w = false;
            appendable.append("  ");
        }
        this.f2244w = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i10) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z2 = this.f2244w;
        Appendable appendable = this.f2243v;
        boolean z10 = false;
        if (z2) {
            this.f2244w = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z10 = true;
        }
        this.f2244w = z10;
        appendable.append(charSequence, i, i10);
        return this;
    }
}
