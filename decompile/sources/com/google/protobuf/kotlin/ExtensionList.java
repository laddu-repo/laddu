package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.MessageLite;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.k;
import we.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExtensionList<E, M extends MessageLite> implements List<E>, a {
    private final List<E> delegate;
    private final ExtensionLite<M, List<E>> extension;

    /* JADX WARN: Multi-variable type inference failed */
    @OnlyForUseByGeneratedProtoCode
    public ExtensionList(ExtensionLite<M, List<E>> extension, List<? extends E> delegate) {
        k.e(extension, "extension");
        k.e(delegate, "delegate");
        this.extension = extension;
        this.delegate = delegate;
    }

    @Override // java.util.List
    public void add(int i6, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i6, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        k.e(elements, "elements");
        return this.delegate.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return k.a(this.delegate, obj);
    }

    @Override // java.util.List
    public E get(int i6) {
        return this.delegate.get(i6);
    }

    public final ExtensionLite<M, List<E>> getExtension() {
        return this.extension;
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.delegate.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.delegate.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new UnmodifiableListIterator(this.delegate.listIterator());
    }

    @Override // java.util.List
    public E remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i6, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i6, int i10) {
        return this.delegate.subList(i6, i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return k.l(this);
    }

    public String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i6) {
        return new UnmodifiableListIterator(this.delegate.listIterator(i6));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        k.e(array, "array");
        return (T[]) k.m(this, array);
    }
}
