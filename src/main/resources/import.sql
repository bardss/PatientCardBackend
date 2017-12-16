INSERT INTO "patientdto" (id, name, surname, patient_code, qr_code) VALUES (1, 'Jakub', 'Aniola', '95071656524', 122075);
INSERT INTO "patientdto" (id, name, surname, patient_code, qr_code) VALUES (2, 'Milan', 'Sawicki', '87073052828', 122076);
INSERT INTO "patientdto" (id, name, surname, patient_code, qr_code) VALUES (3, 'Fabian', 'Grzes', '62040534871', 122077);
INSERT INTO "patientdto" (id, name, surname, patient_code, qr_code) VALUES (4, 'Julia', 'Kot', '58072179546', 122078);

INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (0, 1, '2018-08-01', 0, 120.0, 36.0);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (1, 1, '2018-08-01', 2, 121.0, 35.0);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (2, 1, '2018-08-02', 0, 125.0, 37.0);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (3, 1, '2018-08-02', 2, 123.0, 37.0);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (4, 1, '2018-08-03', 0, 131.0, 36.6);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (5, 1, '2018-08-03', 2, 126.0, 36.9);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (6, 1, '2018-08-04', 0, 125.0, 37.2);
INSERT INTO "fever_carddto" (id, patient_id, date, time_of_day, pulse, temperature) VALUES (7, 1, '2018-08-04', 2, 125.0, 36.4);

INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (0, 1, '2018-08-04', 'Lorem ipsum 1', '19:00:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (1, 1, '2018-08-04', 'Lorem ipsum 2', '19:10:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (2, 1, '2018-08-04', 'Lorem ipsum 3', '19:20:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (3, 1, '2018-08-04', 'Lorem ipsum 4', '19:30:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (4, 1, '2018-08-04', 'Lorem ipsum 5', '19:40:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (5, 1, '2018-08-04', 'Lorem ipsum 6', '19:50:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (6, 1, '2018-08-04', 'Lorem ipsum 7', '20:00:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (7, 1, '2018-08-04', 'Lorem ipsum 8', '20:10:00');
INSERT INTO "observationdto" (id, patient_id, date, note, time) VALUES (8, 1, '2018-08-04', 'Lorem ipsum 9', '20:20:00');
