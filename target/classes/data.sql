INSERT INTO users (username, password, role) VALUES ('admin', 'admin123', 'manager');
INSERT INTO menu_items (name, price) VALUES ('Pizza', 8.99);
INSERT INTO orders (user_id, status) VALUES (1, 'pending');
INSERT INTO order_details (order_id, menu_item_id, quantity) VALUES (1, 1, 3);
