package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f2 extends AbstractList implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2913x;

    /* renamed from: y, reason: collision with root package name */
    public final LazyStringArrayList f2914y;

    public /* synthetic */ f2(LazyStringArrayList lazyStringArrayList, int i6) {
        this.f2913x = i6;
        this.f2914y = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        switch (this.f2913x) {
            case 0:
                this.f2914y.add(i6, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return;
            default:
                this.f2914y.add(i6, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        switch (this.f2913x) {
            case 0:
                return this.f2914y.getByteArray(i6);
            default:
                return this.f2914y.getByteString(i6);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        byte[] asByteArray;
        ByteString asByteString;
        switch (this.f2913x) {
            case 0:
                String remove = this.f2914y.remove(i6);
                ((AbstractList) this).modCount++;
                asByteArray = LazyStringArrayList.asByteArray(remove);
                return asByteArray;
            default:
                String remove2 = this.f2914y.remove(i6);
                ((AbstractList) this).modCount++;
                asByteString = LazyStringArrayList.asByteString(remove2);
                return asByteString;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        Object andReturn;
        byte[] asByteArray;
        Object andReturn2;
        ByteString asByteString;
        switch (this.f2913x) {
            case 0:
                andReturn = this.f2914y.setAndReturn(i6, (byte[]) obj);
                ((AbstractList) this).modCount++;
                asByteArray = LazyStringArrayList.asByteArray(andReturn);
                return asByteArray;
            default:
                andReturn2 = this.f2914y.setAndReturn(i6, (ByteString) obj);
                ((AbstractList) this).modCount++;
                asByteString = LazyStringArrayList.asByteString(andReturn2);
                return asByteString;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f2913x) {
            case 0:
                return this.f2914y.size();
            default:
                return this.f2914y.size();
        }
    }
}
