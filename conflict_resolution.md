# Merge Conflict Шийдвэрлэлт (Multiplication.java)

`feature/multiply-doc-conflict` салбарыг `develop` руу merge хийхэд  
`src/main/java/lab14/sict/must/edu/mn/Multiplication.java` файл дээр  
`multiply` функцын Javadoc коммент дээр merge conflict гарсан.

## Шийдсэн Алхмууд

1. `develop` салбар дээр merge хийсэн:
   ```bash
   git checkout develop
   git merge feature/multiply-doc-conflict
2. Multiplication.java доторх conflict тэмдэглэгээтэй хэсгийг (<<<<<<<, =======, >>>>>>>)
нээгээд Javadoc-ыг нэгтгэн засварласан.

3. Зассан файлыг stage-д оруулж, merge-ийг дуусгасан