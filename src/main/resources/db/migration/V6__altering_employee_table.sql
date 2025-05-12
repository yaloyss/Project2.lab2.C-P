ALTER TABLE employee DROP COLUMN position;
ALTER TABLE employee ADD COLUMN positionId INT;
ALTER TABLE employee ADD CONSTRAINT fk_employee_position FOREIGN KEY (positionId) REFERENCES position(positionId);
