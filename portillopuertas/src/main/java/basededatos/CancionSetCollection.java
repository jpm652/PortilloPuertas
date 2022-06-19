/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;

public class CancionSetCollection extends org.orm.util.ORMSet {
	public CancionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public CancionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Cancion value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Cancion value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Cancion value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Cancion[] toArray() {
		return (Cancion[]) super.toArray(new Cancion[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>titulo</li>
	 * <li>artista</li>
	 * <li>duracion</li>
	 * <li>estilo</li>
	 * <li>imagen_cancion</li>
	 * <li>compositor</li>
	 * <li>productor</li>
	 * <li>numReproducciones</li>
	 * <li>ficheroMultimedia</li>
	 * <li>album</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Cancion[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>titulo</li>
	 * <li>artista</li>
	 * <li>duracion</li>
	 * <li>estilo</li>
	 * <li>imagen_cancion</li>
	 * <li>compositor</li>
	 * <li>productor</li>
	 * <li>numReproducciones</li>
	 * <li>ficheroMultimedia</li>
	 * <li>album</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Cancion[] toArray(String propertyName, boolean ascending) {
		return (Cancion[]) super.toArray(new Cancion[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return MDS12022PFPortilloPuertasPersistentManager.instance();
	}
	
}

