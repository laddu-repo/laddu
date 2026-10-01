package okhttp3.internal.http2;

import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.set = 0;
        int[] iArr = this.values;
        int length = iArr.length;
        k.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, 0);
    }

    public final int get(int i6) {
        return this.values[i6];
    }

    public final boolean getEnablePush(boolean z10) {
        if ((this.set & 4) != 0) {
            if (this.values[2] == 1) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i6) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i6;
    }

    public final int getMaxHeaderListSize(int i6) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i6;
    }

    public final boolean isSet(int i6) {
        if (((1 << i6) & this.set) != 0) {
            return true;
        }
        return false;
    }

    public final void merge(Settings other) {
        k.e(other, "other");
        for (int i6 = 0; i6 < 10; i6++) {
            if (other.isSet(i6)) {
                set(i6, other.get(i6));
            }
        }
    }

    public final Settings set(int i6, int i10) {
        if (i6 >= 0) {
            int[] iArr = this.values;
            if (i6 < iArr.length) {
                this.set = (1 << i6) | this.set;
                iArr[i6] = i10;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
