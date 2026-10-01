package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int i6) {
        return this.list.getByteArray(i6);
    }

    @Override // com.google.protobuf.LazyStringList
    public ByteString getByteString(int i6) {
        return this.list.getByteString(i6);
    }

    @Override // com.google.protobuf.LazyStringList
    public Object getRaw(int i6) {
        return this.list.getRaw(i6);
    }

    @Override // com.google.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        e2 e2Var = new e2();
        e2Var.f2905y = this.list.iterator();
        return e2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.l4, java.lang.Object, java.util.ListIterator<java.lang.String>] */
    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i6) {
        ?? obj = new Object();
        obj.f2983x = this.list.listIterator(i6);
        return obj;
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i6, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i6) {
        return this.list.get(i6);
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i6, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }
}
