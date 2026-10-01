package com.unity3d.ads.core.data.model;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TokenCounters {
    private int seq;
    private int starts;
    private int wins;

    public TokenCounters(int i6, int i10, int i11) {
        this.seq = i6;
        this.wins = i10;
        this.starts = i11;
    }

    public static /* synthetic */ TokenCounters copy$default(TokenCounters tokenCounters, int i6, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i6 = tokenCounters.seq;
        }
        if ((i12 & 2) != 0) {
            i10 = tokenCounters.wins;
        }
        if ((i12 & 4) != 0) {
            i11 = tokenCounters.starts;
        }
        return tokenCounters.copy(i6, i10, i11);
    }

    public final int component1() {
        return this.seq;
    }

    public final int component2() {
        return this.wins;
    }

    public final int component3() {
        return this.starts;
    }

    public final TokenCounters copy(int i6, int i10, int i11) {
        return new TokenCounters(i6, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCounters)) {
            return false;
        }
        TokenCounters tokenCounters = (TokenCounters) obj;
        if (this.seq == tokenCounters.seq && this.wins == tokenCounters.wins && this.starts == tokenCounters.starts) {
            return true;
        }
        return false;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final int getStarts() {
        return this.starts;
    }

    public final int getWins() {
        return this.wins;
    }

    public int hashCode() {
        return (((this.seq * 31) + this.wins) * 31) + this.starts;
    }

    public final void setSeq(int i6) {
        this.seq = i6;
    }

    public final void setStarts(int i6) {
        this.starts = i6;
    }

    public final void setWins(int i6) {
        this.wins = i6;
    }

    public String toString() {
        return "TokenCounters(seq=" + this.seq + ", wins=" + this.wins + ", starts=" + this.starts + ')';
    }
}
