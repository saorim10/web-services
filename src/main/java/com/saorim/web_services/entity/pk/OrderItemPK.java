package com.saorim.web_services.entity.pk;

import java.io.Serializable;
import java.util.Objects;

import com.saorim.web_services.entity.Order;
import com.saorim.web_services.entity.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = -7137314923066071589L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order pedido;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product produto;
	
	
	public OrderItemPK() {
		// empty
	}
	
	
	public OrderItemPK(Order pedido, Product produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	
	public Order getPedido() {
		return pedido;
	}

	public void setPedido(Order pedido) {
		this.pedido = pedido;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}


	@Override
	public int hashCode() {
		return Objects.hash(pedido, produto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(produto, other.produto);
	}
	
}
