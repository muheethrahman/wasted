package com.xworkz.bluetoothApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bluetoothApp.dto.BluetoothDto;

public class BluetoothDaoImpl implements BluetoothDao {

	@Override
	public void save(BluetoothDto bluetoothdto) {
		Configuration configuration =new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BluetoothDto.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bluetoothdto);
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
