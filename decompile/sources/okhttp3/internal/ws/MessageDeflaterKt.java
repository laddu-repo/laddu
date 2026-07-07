package okhttp3.internal.ws;

import bg.n;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MessageDeflaterKt {
    private static final n EMPTY_DEFLATE_BLOCK;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
        n nVar = n.A;
        EMPTY_DEFLATE_BLOCK = l.t("000000ffff");
    }
}
