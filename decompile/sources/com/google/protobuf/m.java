package com.google.protobuf;

import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i6;
        int i10;
        ByteString byteString = (ByteString) obj;
        ByteString byteString2 = (ByteString) obj2;
        ?? iterator2 = byteString.iterator2();
        ?? iterator22 = byteString2.iterator2();
        while (iterator2.hasNext() && iterator22.hasNext()) {
            i6 = ByteString.toInt(iterator2.nextByte());
            Integer valueOf = Integer.valueOf(i6);
            i10 = ByteString.toInt(iterator22.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i10));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
    }
}
