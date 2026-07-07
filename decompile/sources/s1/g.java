package s1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f11986a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean c();

    ByteBuffer d();

    e e(e eVar);

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    boolean isActive();

    void reset();
}
