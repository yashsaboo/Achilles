package fr.doan.achilles.entity.metadata;

/**
 * JoinWideMapMeta
 * 
 * @author DuyHai DOAN
 * 
 */
public class JoinWideMapMeta<K, V> extends PropertyMeta<K, V>
{

	@Override
	public PropertyType propertyType()
	{
		return PropertyType.JOIN_WIDE_MAP;
	}

	@Override
	public boolean isSingleKey()
	{
		return true;
	}

	@Override
	public boolean isLazy()
	{
		return true;
	}

	@Override
	public boolean isJoinColumn()
	{
		return true;
	}
}