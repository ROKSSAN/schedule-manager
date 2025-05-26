## 🗂 ERD 설계

### ✅ Entity: User

| 필드명       | 타입              | 설명             |
|--------------|-------------------|------------------|
| id           | Long              | 기본키 (PK)      |
| username     | String            | 사용자 이름       |
| email        | String (unique)   | 이메일 주소       |
| password     | String            | 비밀번호         |
| createdAt    | LocalDateTime     | 생성 시간        |
| modifiedAt   | LocalDateTime     | 수정 시간        |

---

### ✅ Entity: Schedule

| 필드명       | 타입              | 설명                         |
|--------------|-------------------|------------------------------|
| id           | Long              | 기본키 (PK)                  |
| title        | String            | 일정 제목                     |
| content      | String            | 일정 내용                     |
| user         | User (연관관계)   | 작성자 (ManyToOne)           |
| createdAt    | LocalDateTime     | 생성 시간                    |
| modifiedAt   | LocalDateTime     | 수정 시간                    |

---

### 🔗 관계 (Relationship)

- **User (1) : (N) Schedule**
  - 한 명의 사용자가 여러 개의 일정을 작성할 수 있음
  - 연관관계는 단방향 (Schedule → User)
