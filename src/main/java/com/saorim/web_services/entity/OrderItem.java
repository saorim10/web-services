package com.saorim.web_services.entity;

import java.io.Serializable;
import java.util.Objects;

import com.saorim.web_services.entity.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 6734260812347005674L;

	@EmbeddedId
	private OrderItemPK id;
	
	private Integer quantidade;
	private Double preco;
	
	
	public OrderItem() {
		// empty
	}
	
	public OrderItem(Order pedido, Product produto, Integer quantidade, Double preco) {
		this.id.setPedido(pedido);
		this.id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Order getPedido() {
		return id.getPedido();
	}
	
	public void setPedido(Order pedido) {
		id.setPedido(pedido);
	}
	
	public Product getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Product produto) {
		id.setProduto(produto);
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
}
