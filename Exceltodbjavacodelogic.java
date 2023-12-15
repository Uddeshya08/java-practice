List<String> mandatoryColumns = new ArrayList<>();

            // Read mandatory columns from the M/O row
            Row moRow = sheet.getRow(1);
            for (Cell cell : moRow) {
                if (cell.getStringCellValue().equals("M")) {
                    Cell headerCell = sheet.getRow(0).getCell(cell.getColumnIndex());
                    mandatoryColumns.add(headerCell.getStringCellValue());
                }
            }

// ...

// Iterate through rows to process data
for (Row currentRow : sheet) {
    if (currentRow.getRowNum() <= 1) {
        continue; // Skip header and M/O row
    }

    // Create an object of your Entity Model class
    PublishFeed publishFeed = new PublishFeed(); // Replace PublishFeed with your Entity Model class

    // Iterate through cells in the current row
    for (int i = 0; i < mandatoryColumns.size(); i++) {
        Cell currentCell = currentRow.getCell(i);

        if (currentCell != null) {
            String columnName = mandatoryColumns.get(i);

            // Check if the column is optional ('O')
            if (sheet.getRow(1).getCell(i).getStringCellValue().equals("O")) {
                // Handle optional fields
                if (currentCell.getCellType() != CellType.BLANK) {
                    String cellValue = currentCell.getStringCellValue();
                    // Set the optional field value into your Entity Model class using setters
                    switch (columnName) {
                        case "OptionalColumn1":
                            publishFeed.setOptionalColumn1(cellValue);
                            break;
                        case "OptionalColumn2":
                            publishFeed.setOptionalColumn2(cellValue);
                            break;
                        // Add cases for other optional columns
                    }
                }
                // If the cell is blank and it's optional, do nothing (leave the field as default or empty)
            } else {
                // Mandatory field handling (same as in the previous code)
                if (currentCell.getCellType() == CellType.BLANK) {
                    throw new Exception("Mandatory field is empty.");
                } else {
                    String cellValue = currentCell.getStringCellValue();
                    // Set the mandatory field value into your Entity Model class using setters
                    switch (columnName) {
                        case "Column1":
                            publishFeed.setColumn1(cellValue);
                            break;
                        case "Column2":
                            publishFeed.setColumn2(cellValue);
                            break;
                        // Add cases for other mandatory columns
                    }
                }
            }
        }
    }

    // Save the publishFeed object to the database using your repository
    // Example: repository.save(publishFeed);
    // Replace repository.save(publishFeed) with your repository's save method
}

// ...
