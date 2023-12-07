package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cart_item")
public class CartItem  extends BaseClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartitem_id")
    private Long cartItemId;
    @Column(name = "cart_id")
    private Long cartId;
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "quantity")
    private Long quantity;

    public CartItem(Long cartItemId, Long cartId, Long productId, Long quantity) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItem() {
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
