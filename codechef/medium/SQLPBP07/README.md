# SQLPBP07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Handling NULL Values
### Task

Write a query to retrieve book_id, title, author and published_year of the books which have  **NULL**  rating for their books.

 **Table name** : `Library`

book_id	title	author	published_year	rating
1	The Great Gatsby	F. Scott Fitzgerald	1925	4.2
2	To Kill a Mockingbird	Harper Lee	1960	NULL
3	1984	George Orwell	1949	4.8
4	The Catcher in the Rye	J.D. Salinger	1951	NULL
5	Brave New World	Aldous Huxley	1932	4.3
### Expected column
- book_id
- title
- author
- published_year

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T09:26:26.921Z  

```sql
-- your code goes here
select book_id,title,author,published_year from Library where rating is NULL;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLPBP07)