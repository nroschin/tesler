package ${package}.crudma.config;

import io.tesler.core.crudma.bc.BcIdentifier;
import io.tesler.core.crudma.bc.EnumBcIdentifier;
import io.tesler.core.crudma.bc.impl.AbstractEnumBcSupplier;
import io.tesler.core.crudma.bc.impl.BcDescription;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public enum ${appUpperCaseName}ServiceAssociation implements EnumBcIdentifier {

	// @formatter:off

	;

	// @formatter:on

	public static final EnumBcIdentifier.Holder<${appUpperCaseName}ServiceAssociation> Holder = new Holder<>(${appUpperCaseName}ServiceAssociation.class);

	private final BcDescription bcDescription;

	${appUpperCaseName}ServiceAssociation(String parentName, Class<?> serviceClass, boolean refresh) {
		this.bcDescription = buildDescription(parentName, serviceClass, refresh);
	}

	${appUpperCaseName}ServiceAssociation(String parentName, Class<?> serviceClass) {
		this(parentName, serviceClass, false);
	}

	${appUpperCaseName}ServiceAssociation(BcIdentifier parent, Class<?> serviceClass, boolean refresh) {
		this(parent == null ? null : parent.getName(), serviceClass, refresh);
	}

	${appUpperCaseName}ServiceAssociation(BcIdentifier parent, Class<?> serviceClass) {
		this(parent, serviceClass, false);
	}

	${appUpperCaseName}ServiceAssociation(Class<?> serviceClass, boolean refresh) {
		this((String) null, serviceClass, refresh);
	}

	${appUpperCaseName}ServiceAssociation(Class<?> serviceClass) {
		this((String) null, serviceClass, false);
	}

	@Component
	public static class ${appUpperCaseName}BcSupplier extends AbstractEnumBcSupplier<${appUpperCaseName}ServiceAssociation> {

		public ${appUpperCaseName}BcSupplier() {
			super(${appUpperCaseName}ServiceAssociation.Holder);
		}

	}

}
