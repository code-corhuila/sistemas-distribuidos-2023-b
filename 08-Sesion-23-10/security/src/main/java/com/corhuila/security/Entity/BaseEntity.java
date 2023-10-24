package com.corhuila.security.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Column(name = "state", nullable = false)
	private Boolean state;
	
	@Column(name = "created_at", nullable = true)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at", nullable = true)
	private LocalDateTime updatedAt;
	
	@Column(name = "deleted_at", nullable = true)
	private LocalDateTime deletedAt;
	
	@Column(name = "created_user", nullable = true)
	private Long createdUser;
	
	@Column(name = "updated_user", nullable = true)
	private Long updatedUser;
	
	@Column(name = "deleted_user", nullable = true)
	private Long deletedUser;

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
}
