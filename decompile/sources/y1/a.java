package y1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    private int flags;

    public final void addFlag(int i6) {
        this.flags = i6 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i6) {
        this.flags = (~i6) & this.flags;
    }

    public final boolean getFlag(int i6) {
        if ((this.flags & i6) == i6) {
            return true;
        }
        return false;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int i6) {
        this.flags = i6;
    }
}
