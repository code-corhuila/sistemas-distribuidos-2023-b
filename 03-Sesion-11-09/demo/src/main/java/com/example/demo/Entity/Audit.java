package com.example.demo.Entity;

import java.time.LocalDateTime;

public abstract class Audit {
	
	private Boolean state;
	
	private LocalDateTime createAt;
	
	private LocalDateTime updateAt;
	
	private LocalDateTime deleteAt;
	
	public Boolean getState() {
		return this.state;
	}
	
	public void setState(Boolean state) {
		this.state = state;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	public LocalDateTime getDeleteAt() {
		return deleteAt;
	}

	public void setDeleteAt(LocalDateTime deleteAt) {
		this.deleteAt = deleteAt;
	}	
	
}
