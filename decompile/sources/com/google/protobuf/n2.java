package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f2994b = new n1(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2995a;

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.protobuf.m2, java.lang.Object] */
    public n2(int i6) {
        t2 t2Var;
        switch (i6) {
            case 1:
                this.f2995a = new ArrayDeque();
                return;
            default:
                try {
                    t2Var = (t2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    t2Var = f2994b;
                }
                t2[] t2VarArr = {n1.f2992b, t2Var};
                ?? obj = new Object();
                obj.f2988a = t2VarArr;
                this.f2995a = (t2) Internal.checkNotNull(obj, "messageInfoFactory");
                return;
        }
    }

    public void a(ByteString byteString) {
        if (byteString.isBalanced()) {
            int binarySearch = Arrays.binarySearch(p3.C, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int a10 = p3.a(binarySearch + 1);
            ArrayDeque arrayDeque = (ArrayDeque) this.f2995a;
            if (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < a10) {
                int a11 = p3.a(binarySearch);
                ByteString byteString2 = (ByteString) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < a11) {
                    byteString2 = new p3((ByteString) arrayDeque.pop(), byteString2);
                }
                p3 p3Var = new p3(byteString2, byteString);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(p3.C, p3Var.f3016x);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((ByteString) arrayDeque.peek()).size() >= p3.a(binarySearch2 + 1)) {
                        break;
                    } else {
                        p3Var = new p3((ByteString) arrayDeque.pop(), p3Var);
                    }
                }
                arrayDeque.push(p3Var);
                return;
            }
            arrayDeque.push(byteString);
            return;
        }
        if (byteString instanceof p3) {
            p3 p3Var2 = (p3) byteString;
            a(p3Var2.f3017y);
            a(p3Var2.f3018z);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
        }
    }
}
