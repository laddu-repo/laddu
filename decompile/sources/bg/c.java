package bg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Incorrect condition in loop: B:10:0x0058 */
    /* JADX WARN: Type inference failed for: r4v8, types: [bg.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(bg.c r4, bg.g r5, long r6, boolean r8) {
        /*
            r4.getClass()
            bg.g r4 = bg.g.access$getHead$cp()
            if (r4 != 0) goto L1f
            bg.g r4 = new bg.g
            r4.<init>()
            bg.g.access$setHead$cp(r4)
            bg.d r4 = new bg.d
            java.lang.String r0 = "Okio Watchdog"
            r4.<init>(r0)
            r0 = 1
            r4.setDaemon(r0)
            r4.start()
        L1f:
            long r0 = java.lang.System.nanoTime()
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L39
            if (r8 == 0) goto L39
            long r2 = r5.deadlineNanoTime()
            long r2 = r2 - r0
            long r6 = java.lang.Math.min(r6, r2)
            long r6 = r6 + r0
            bg.g.access$setTimeoutAt$p(r5, r6)
            goto L49
        L39:
            if (r4 == 0) goto L40
            long r6 = r6 + r0
            bg.g.access$setTimeoutAt$p(r5, r6)
            goto L49
        L40:
            if (r8 == 0) goto L8a
            long r6 = r5.deadlineNanoTime()
            bg.g.access$setTimeoutAt$p(r5, r6)
        L49:
            long r6 = bg.g.access$remainingNanos(r5, r0)
            bg.g r4 = bg.g.access$getHead$cp()
            kotlin.jvm.internal.k.b(r4)
        L54:
            bg.g r8 = bg.g.access$getNext$p(r4)
            if (r8 == 0) goto L72
            bg.g r8 = bg.g.access$getNext$p(r4)
            kotlin.jvm.internal.k.b(r8)
            long r2 = bg.g.access$remainingNanos(r8, r0)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L6a
            goto L72
        L6a:
            bg.g r4 = bg.g.access$getNext$p(r4)
            kotlin.jvm.internal.k.b(r4)
            goto L54
        L72:
            bg.g r6 = bg.g.access$getNext$p(r4)
            bg.g.access$setNext$p(r5, r6)
            bg.g.access$setNext$p(r4, r5)
            bg.g r5 = bg.g.access$getHead$cp()
            if (r4 != r5) goto L89
            java.util.concurrent.locks.Condition r4 = bg.g.access$getCondition$cp()
            r4.signal()
        L89:
            return
        L8a:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.c.a(bg.c, bg.g, long, boolean):void");
    }

    public static final void b(c cVar, g gVar) {
        g gVar2;
        g gVar3;
        g gVar4;
        cVar.getClass();
        for (gVar2 = g.head; gVar2 != null; gVar2 = gVar2.next) {
            gVar3 = gVar2.next;
            if (gVar3 == gVar) {
                gVar4 = gVar.next;
                gVar2.next = gVar4;
                gVar.next = null;
                return;
            }
        }
        throw new IllegalStateException("node was not found in the queue");
    }

    public static g c() {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        Condition condition;
        Condition condition2;
        long j;
        g gVar5;
        g gVar6;
        long j10;
        g gVar7;
        gVar = g.head;
        kotlin.jvm.internal.k.b(gVar);
        gVar2 = gVar.next;
        if (gVar2 == null) {
            long nanoTime = System.nanoTime();
            condition2 = g.condition;
            j = g.IDLE_TIMEOUT_MILLIS;
            condition2.await(j, TimeUnit.MILLISECONDS);
            gVar5 = g.head;
            kotlin.jvm.internal.k.b(gVar5);
            gVar6 = gVar5.next;
            if (gVar6 == null) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                j10 = g.IDLE_TIMEOUT_NANOS;
                if (nanoTime2 >= j10) {
                    gVar7 = g.head;
                    return gVar7;
                }
            }
            return null;
        }
        long access$remainingNanos = g.access$remainingNanos(gVar2, System.nanoTime());
        if (access$remainingNanos > 0) {
            condition = g.condition;
            condition.await(access$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        gVar3 = g.head;
        kotlin.jvm.internal.k.b(gVar3);
        gVar4 = gVar2.next;
        gVar3.next = gVar4;
        gVar2.next = null;
        gVar2.state = 2;
        return gVar2;
    }
}
