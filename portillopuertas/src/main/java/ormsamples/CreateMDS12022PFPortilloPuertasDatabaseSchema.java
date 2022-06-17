/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12022PFPortilloPuertasDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.MDS12022PFPortilloPuertasPersistentManager.instance());
			basededatos.MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
